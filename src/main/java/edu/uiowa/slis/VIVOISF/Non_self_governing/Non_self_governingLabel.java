package edu.uiowa.slis.VIVOISF.Non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Non_self_governingLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Non_self_governingLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(Non_self_governingLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Non_self_governing theNon_self_governing = (Non_self_governing)findAncestorWithClass(this, Non_self_governing.class);
			if (!theNon_self_governing.commitNeeded) {
				pageContext.getOut().print(theNon_self_governing.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Non_self_governing for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Non_self_governing for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Non_self_governing theNon_self_governing = (Non_self_governing)findAncestorWithClass(this, Non_self_governing.class);
			return theNon_self_governing.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Non_self_governing for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Non_self_governing for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Non_self_governing theNon_self_governing = (Non_self_governing)findAncestorWithClass(this, Non_self_governing.class);
			theNon_self_governing.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Non_self_governing for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Non_self_governing for label tag ");
		}
	}
}

