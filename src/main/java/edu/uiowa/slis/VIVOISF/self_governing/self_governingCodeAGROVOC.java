package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingCodeAGROVOCIterator theself_governing = (self_governingCodeAGROVOCIterator)findAncestorWithClass(this, self_governingCodeAGROVOCIterator.class);
			pageContext.getOut().print(theself_governing.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

