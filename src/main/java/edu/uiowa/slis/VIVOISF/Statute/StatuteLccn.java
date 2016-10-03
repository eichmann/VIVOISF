package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StatuteLccnIterator theStatute = (StatuteLccnIterator)findAncestorWithClass(this, StatuteLccnIterator.class);
			pageContext.getOut().print(theStatute.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for lccn tag ");
		}
		return SKIP_BODY;
	}
}

