package edu.uiowa.slis.VIVOISF.OBI_0001554;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0001554Label extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0001554Label currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0001554Label.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			OBI_0001554 theOBI_0001554 = (OBI_0001554)findAncestorWithClass(this, OBI_0001554.class);
			if (!theOBI_0001554.commitNeeded) {
				pageContext.getOut().print(theOBI_0001554.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0001554 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0001554 for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			OBI_0001554 theOBI_0001554 = (OBI_0001554)findAncestorWithClass(this, OBI_0001554.class);
			return theOBI_0001554.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing OBI_0001554 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0001554 for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			OBI_0001554 theOBI_0001554 = (OBI_0001554)findAncestorWithClass(this, OBI_0001554.class);
			theOBI_0001554.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0001554 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0001554 for label tag ");
		}
	}
}

