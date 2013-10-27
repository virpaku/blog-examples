// default configurations
webapp {
    url = 'http://localhost'
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
        mail {
            url = 'http://testserver'
        }
    }
    
    live {
        host = 'www.chrislormor.com'
        mail {
            port = 8081
            url = 'http://www.chrislormor.com'
        }
    }
}
