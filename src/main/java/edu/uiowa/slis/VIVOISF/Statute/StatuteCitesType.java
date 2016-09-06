package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StatuteCitesIterator theStatuteCitesIterator = (StatuteCitesIterator)findAncestorWithClass(this, StatuteCitesIterator.class);
			pageContext.getOut().print(theStatuteCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for cites tag ");
		}
		return SKIP_BODY;
	}
}

