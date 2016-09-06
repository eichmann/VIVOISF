package edu.uiowa.slis.VIVOISF.Home;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HomeSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HomeSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(HomeSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Home theHome = (Home)findAncestorWithClass(this, Home.class);
			if (!theHome.commitNeeded) {
				pageContext.getOut().print(theHome.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Home for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Home for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Home theHome = (Home)findAncestorWithClass(this, Home.class);
			return theHome.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Home for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Home for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Home theHome = (Home)findAncestorWithClass(this, Home.class);
			theHome.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Home for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Home for subjectURI tag ");
		}
	}
}

