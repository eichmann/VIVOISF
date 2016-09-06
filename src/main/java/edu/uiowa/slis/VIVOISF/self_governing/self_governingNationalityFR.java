package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingNationalityFRIterator theself_governing = (self_governingNationalityFRIterator)findAncestorWithClass(this, self_governingNationalityFRIterator.class);
			pageContext.getOut().print(theself_governing.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

