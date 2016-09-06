package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingNationalityITIterator theself_governing = (self_governingNationalityITIterator)findAncestorWithClass(this, self_governingNationalityITIterator.class);
			pageContext.getOut().print(theself_governing.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

