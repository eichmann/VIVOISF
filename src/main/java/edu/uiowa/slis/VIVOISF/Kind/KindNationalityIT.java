package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(KindNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindNationalityITIterator theKind = (KindNationalityITIterator)findAncestorWithClass(this, KindNationalityITIterator.class);
			pageContext.getOut().print(theKind.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

