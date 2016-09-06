package edu.uiowa.slis.VIVOISF.OBI_0000272;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000272Label extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000272Label currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000272Label.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			OBI_0000272 theOBI_0000272 = (OBI_0000272)findAncestorWithClass(this, OBI_0000272.class);
			if (!theOBI_0000272.commitNeeded) {
				pageContext.getOut().print(theOBI_0000272.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000272 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000272 for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			OBI_0000272 theOBI_0000272 = (OBI_0000272)findAncestorWithClass(this, OBI_0000272.class);
			return theOBI_0000272.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing OBI_0000272 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000272 for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			OBI_0000272 theOBI_0000272 = (OBI_0000272)findAncestorWithClass(this, OBI_0000272.class);
			theOBI_0000272.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000272 for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000272 for label tag ");
		}
	}
}

