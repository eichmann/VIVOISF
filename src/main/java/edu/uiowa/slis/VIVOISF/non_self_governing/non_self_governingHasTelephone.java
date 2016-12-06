package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingHasTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingHasTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingHasTelephone.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			non_self_governingHasTelephoneIterator thenon_self_governingHasTelephoneIterator = (non_self_governingHasTelephoneIterator)findAncestorWithClass(this, non_self_governingHasTelephoneIterator.class);
			pageContext.getOut().print(thenon_self_governingHasTelephoneIterator.getHasTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}
