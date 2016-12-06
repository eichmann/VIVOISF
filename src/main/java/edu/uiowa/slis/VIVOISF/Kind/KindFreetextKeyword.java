package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(KindFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindFreetextKeywordIterator theKind = (KindFreetextKeywordIterator)findAncestorWithClass(this, KindFreetextKeywordIterator.class);
			pageContext.getOut().print(theKind.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

