package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingNationalityESIterator theself_governing = (self_governingNationalityESIterator)findAncestorWithClass(this, self_governingNationalityESIterator.class);
			pageContext.getOut().print(theself_governing.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

