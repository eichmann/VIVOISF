package edu.uiowa.slis.VIVOISF.Presentation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PresentationRO_0000057 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PresentationRO_0000057 currentInstance = null;
	private static final Log log = LogFactory.getLog(PresentationRO_0000057.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PresentationRO_0000057Iterator thePresentationRO_0000057Iterator = (PresentationRO_0000057Iterator)findAncestorWithClass(this, PresentationRO_0000057Iterator.class);
			pageContext.getOut().print(thePresentationRO_0000057Iterator.getRO_0000057());
		} catch (Exception e) {
			log.error("Can't find enclosing Presentation for RO_0000057 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Presentation for RO_0000057 tag ");
		}
		return SKIP_BODY;
	}
}

