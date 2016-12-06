package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(KindNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindNameListZHIterator theKind = (KindNameListZHIterator)findAncestorWithClass(this, KindNameListZHIterator.class);
			pageContext.getOut().print(theKind.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

