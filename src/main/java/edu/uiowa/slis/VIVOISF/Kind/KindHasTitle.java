package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindHasTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(KindHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KindHasTitleIterator theKindHasTitleIterator = (KindHasTitleIterator)findAncestorWithClass(this, KindHasTitleIterator.class);
			pageContext.getOut().print(theKindHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

