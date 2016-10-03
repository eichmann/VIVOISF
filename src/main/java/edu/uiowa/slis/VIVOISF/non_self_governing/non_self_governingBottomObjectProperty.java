package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingBottomObjectProperty extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingBottomObjectProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingBottomObjectProperty.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			non_self_governingBottomObjectPropertyIterator thenon_self_governingBottomObjectPropertyIterator = (non_self_governingBottomObjectPropertyIterator)findAncestorWithClass(this, non_self_governingBottomObjectPropertyIterator.class);
			pageContext.getOut().print(thenon_self_governingBottomObjectPropertyIterator.getBottomObjectProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for bottomObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for bottomObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

