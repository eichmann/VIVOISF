package edu.uiowa.slis.VIVOISF.Home;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HomeLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HomeLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(HomeLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Home theHome = (Home)findAncestorWithClass(this, Home.class);
			if (!theHome.commitNeeded) {
				pageContext.getOut().print(theHome.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Home for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Home for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Home theHome = (Home)findAncestorWithClass(this, Home.class);
			return theHome.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Home for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Home for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Home theHome = (Home)findAncestorWithClass(this, Home.class);
			theHome.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Home for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Home for label tag ");
		}
	}
}

