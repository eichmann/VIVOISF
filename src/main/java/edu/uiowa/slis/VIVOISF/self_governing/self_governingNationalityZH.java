package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingNationalityZHIterator theself_governing = (self_governingNationalityZHIterator)findAncestorWithClass(this, self_governingNationalityZHIterator.class);
			pageContext.getOut().print(theself_governing.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

