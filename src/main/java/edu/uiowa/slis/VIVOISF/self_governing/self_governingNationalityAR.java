package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingNationalityARIterator theself_governing = (self_governingNationalityARIterator)findAncestorWithClass(this, self_governingNationalityARIterator.class);
			pageContext.getOut().print(theself_governing.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

