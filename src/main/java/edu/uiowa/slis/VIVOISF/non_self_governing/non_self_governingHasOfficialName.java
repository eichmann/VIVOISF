package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingHasOfficialName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingHasOfficialName currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingHasOfficialName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			non_self_governingHasOfficialNameIterator thenon_self_governing = (non_self_governingHasOfficialNameIterator)findAncestorWithClass(this, non_self_governingHasOfficialNameIterator.class);
			pageContext.getOut().print(thenon_self_governing.getHasOfficialName());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for hasOfficialName tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for hasOfficialName tag ");
		}
		return SKIP_BODY;
	}
}

