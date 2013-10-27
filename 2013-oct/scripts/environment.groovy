// default configurations
webapp {
    port = 80
}

// environment-specific configurations
environments {
    dev {
	host = 'localhost'
	webapp {
        	port = 8080
	}        
    }
    
    staging {
        host = 'testserver'
    }
    
    live {
        host = 'www.chrislormor.com'
        webapp {
            port = 8081
        }
    }
}
