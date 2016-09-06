package edu.uiowa.slis.VIVOISF.PresentingProcess;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PresentingProcessRO_0000057Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PresentingProcessRO_0000057Type currentInstance = null;
	private static final Log log = LogFactory.getLog(PresentingProcessRO_0000057Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PresentingProcessRO_0000057Iterator thePresentingProcessRO_0000057Iterator = (PresentingProcessRO_0000057Iterator)findAncestorWithClass(this, PresentingProcessRO_0000057Iterator.class);
			pageContext.getOut().print(thePresentingProcessRO_0000057Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PresentingProcess for RO_0000057 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PresentingProcess for RO_0000057 tag ");
		}
		return SKIP_BODY;
	}
}

