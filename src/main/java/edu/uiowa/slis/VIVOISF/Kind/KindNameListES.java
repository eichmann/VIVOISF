package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(KindNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindNameListESIterator theKind = (KindNameListESIterator)findAncestorWithClass(this, KindNameListESIterator.class);
			pageContext.getOut().print(theKind.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

