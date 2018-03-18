<?php

namespace App;

use Zizaco\Entrust\EntrustRole;

class Role extends EntrustRole
{
    protected $table = 'roles';

        protected $fillable = [
            'name', 'display_name', 'description'
        ];

        public function permissions()
        {
            return $this->belongsToMany('App\Permission','permission_role', 'role_id', 'permission_id');

        }
        public function users()
        {
            return $this->belongsToMany('App\Models\Teds\User','role_user', 'role_id', 'user_id');

        }
        public function verificarPermissao($permissoes, $p){
            $contador = 0;
            foreach ($permissoes as $p2) {
                if ($p->id == $p2->id) {
                    $contador++;
                }
            }
            if ($contador>0) {
                return true;
            }else {
                return false;
            }
        }
}
