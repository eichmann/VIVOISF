package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(KindNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindNationalityRUIterator theKind = (KindNationalityRUIterator)findAncestorWithClass(this, KindNationalityRUIterator.class);
			pageContext.getOut().print(theKind.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

