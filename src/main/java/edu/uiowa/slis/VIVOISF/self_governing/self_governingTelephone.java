package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingTelephone.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingTelephoneIterator theself_governing = (self_governingTelephoneIterator)findAncestorWithClass(this, self_governingTelephoneIterator.class);
			pageContext.getOut().print(theself_governing.getTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for telephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for telephone tag ");
		}
		return SKIP_BODY;
	}
}

