package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(KindDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindDescriptionIterator theKind = (KindDescriptionIterator)findAncestorWithClass(this, KindDescriptionIterator.class);
			pageContext.getOut().print(theKind.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for description tag ");
		}
		return SKIP_BODY;
	}
}

