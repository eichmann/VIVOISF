package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumDirectorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumDirectorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumDirectorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConsortiumDirectorInverseIterator theConsortiumDirectorInverseIterator = (ConsortiumDirectorInverseIterator)findAncestorWithClass(this, ConsortiumDirectorInverseIterator.class);
			pageContext.getOut().print(theConsortiumDirectorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for director tag ");
		}
		return SKIP_BODY;
	}
}

