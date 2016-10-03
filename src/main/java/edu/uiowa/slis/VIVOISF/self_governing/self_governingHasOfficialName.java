package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingHasOfficialName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingHasOfficialName currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingHasOfficialName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingHasOfficialNameIterator theself_governing = (self_governingHasOfficialNameIterator)findAncestorWithClass(this, self_governingHasOfficialNameIterator.class);
			pageContext.getOut().print(theself_governing.getHasOfficialName());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for hasOfficialName tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for hasOfficialName tag ");
		}
		return SKIP_BODY;
	}
}

