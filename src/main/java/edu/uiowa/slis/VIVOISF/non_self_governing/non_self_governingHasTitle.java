package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingHasTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			non_self_governingHasTitleIterator thenon_self_governingHasTitleIterator = (non_self_governingHasTitleIterator)findAncestorWithClass(this, non_self_governingHasTitleIterator.class);
			pageContext.getOut().print(thenon_self_governingHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

