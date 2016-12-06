package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(KindNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindNationalityESIterator theKind = (KindNationalityESIterator)findAncestorWithClass(this, KindNationalityESIterator.class);
			pageContext.getOut().print(theKind.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

