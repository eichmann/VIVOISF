package edu.uiowa.slis.VIVOISF.PresentingProcess;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PresentingProcessBFO_0000055Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PresentingProcessBFO_0000055Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PresentingProcessBFO_0000055Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PresentingProcessBFO_0000055Iterator thePresentingProcessBFO_0000055Iterator = (PresentingProcessBFO_0000055Iterator)findAncestorWithClass(this, PresentingProcessBFO_0000055Iterator.class);
			pageContext.getOut().print(thePresentingProcessBFO_0000055Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PresentingProcess for BFO_0000055 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PresentingProcess for BFO_0000055 tag ");
		}
		return SKIP_BODY;
	}
}

