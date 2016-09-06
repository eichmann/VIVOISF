package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingCodeUNDPIterator theself_governing = (self_governingCodeUNDPIterator)findAncestorWithClass(this, self_governingCodeUNDPIterator.class);
			pageContext.getOut().print(theself_governing.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

