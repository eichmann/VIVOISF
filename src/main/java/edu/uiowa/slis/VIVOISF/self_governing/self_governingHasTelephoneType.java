package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingHasTelephoneType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingHasTelephoneType currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingHasTelephoneType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingHasTelephoneIterator theself_governingHasTelephoneIterator = (self_governingHasTelephoneIterator)findAncestorWithClass(this, self_governingHasTelephoneIterator.class);
			pageContext.getOut().print(theself_governingHasTelephoneIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

