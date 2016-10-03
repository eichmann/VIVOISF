package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingTopObjectProperty extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingTopObjectProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingTopObjectProperty.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			non_self_governingTopObjectPropertyIterator thenon_self_governingTopObjectPropertyIterator = (non_self_governingTopObjectPropertyIterator)findAncestorWithClass(this, non_self_governingTopObjectPropertyIterator.class);
			pageContext.getOut().print(thenon_self_governingTopObjectPropertyIterator.getTopObjectProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for topObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for topObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

