package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(KindNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindNationalityZHIterator theKind = (KindNationalityZHIterator)findAncestorWithClass(this, KindNationalityZHIterator.class);
			pageContext.getOut().print(theKind.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

