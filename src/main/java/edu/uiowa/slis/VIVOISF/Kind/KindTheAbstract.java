package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(KindTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindTheAbstractIterator theKind = (KindTheAbstractIterator)findAncestorWithClass(this, KindTheAbstractIterator.class);
			pageContext.getOut().print(theKind.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

