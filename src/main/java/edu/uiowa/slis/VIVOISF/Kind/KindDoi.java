package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(KindDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindDoiIterator theKind = (KindDoiIterator)findAncestorWithClass(this, KindDoiIterator.class);
			pageContext.getOut().print(theKind.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for doi tag ");
		}
		return SKIP_BODY;
	}
}

