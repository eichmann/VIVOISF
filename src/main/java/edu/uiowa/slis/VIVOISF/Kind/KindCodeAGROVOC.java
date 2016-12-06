package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(KindCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindCodeAGROVOCIterator theKind = (KindCodeAGROVOCIterator)findAncestorWithClass(this, KindCodeAGROVOCIterator.class);
			pageContext.getOut().print(theKind.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

