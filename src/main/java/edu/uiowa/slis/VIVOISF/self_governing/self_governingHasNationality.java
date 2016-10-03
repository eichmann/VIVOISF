package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingHasNationality extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingHasNationality currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingHasNationality.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingHasNationalityIterator theself_governing = (self_governingHasNationalityIterator)findAncestorWithClass(this, self_governingHasNationalityIterator.class);
			pageContext.getOut().print(theself_governing.getHasNationality());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for hasNationality tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for hasNationality tag ");
		}
		return SKIP_BODY;
	}
}

