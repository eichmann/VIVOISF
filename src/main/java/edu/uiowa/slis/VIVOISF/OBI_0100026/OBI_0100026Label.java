package edu.uiowa.slis.VIVOISF.OBI_0100026;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0100026Label extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0100026Label currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0100026Label.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			OBI_0100026 theOBI_0100026 = (OBI_0100026)findAncestorWithClass(this, OBI_0100026.class);
			if (!theOBI_0100026.commitNeeded) {
				pageContext.getOut().print(theOBI_0100026.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0100026 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0100026 for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			OBI_0100026 theOBI_0100026 = (OBI_0100026)findAncestorWithClass(this, OBI_0100026.class);
			return theOBI_0100026.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing OBI_0100026 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0100026 for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			OBI_0100026 theOBI_0100026 = (OBI_0100026)findAncestorWithClass(this, OBI_0100026.class);
			theOBI_0100026.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0100026 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0100026 for label tag ");
		}
	}
}

