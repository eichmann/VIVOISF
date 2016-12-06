package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindRelates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindRelates currentInstance = null;
	private static final Log log = LogFactory.getLog(KindRelates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KindRelatesIterator theKindRelatesIterator = (KindRelatesIterator)findAncestorWithClass(this, KindRelatesIterator.class);
			pageContext.getOut().print(theKindRelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for relates tag ");
		}
		return SKIP_BODY;
	}
}

