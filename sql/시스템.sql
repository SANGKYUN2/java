create user haksa identified by pass; /* create : 생성 */

drop user haksa; /* drop : 삭제 */

grant connect, resource, dba to haksa; /* dba = 데이터 베이스 어드민, grant : 권한 부여 */