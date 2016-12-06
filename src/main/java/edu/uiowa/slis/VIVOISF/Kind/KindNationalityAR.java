package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(KindNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindNationalityARIterator theKind = (KindNationalityARIterator)findAncestorWithClass(this, KindNationalityARIterator.class);
			pageContext.getOut().print(theKind.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

