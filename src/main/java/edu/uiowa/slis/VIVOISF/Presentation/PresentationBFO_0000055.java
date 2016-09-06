package edu.uiowa.slis.VIVOISF.Presentation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PresentationBFO_0000055 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PresentationBFO_0000055 currentInstance = null;
	private static final Log log = LogFactory.getLog(PresentationBFO_0000055.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PresentationBFO_0000055Iterator thePresentationBFO_0000055Iterator = (PresentationBFO_0000055Iterator)findAncestorWithClass(this, PresentationBFO_0000055Iterator.class);
			pageContext.getOut().print(thePresentationBFO_0000055Iterator.getBFO_0000055());
		} catch (Exception e) {
			log.error("Can't find enclosing Presentation for BFO_0000055 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Presentation for BFO_0000055 tag ");
		}
		return SKIP_BODY;
	}
}

