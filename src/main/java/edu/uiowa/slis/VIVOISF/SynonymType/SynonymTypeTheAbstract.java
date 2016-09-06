package edu.uiowa.slis.VIVOISF.SynonymType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SynonymTypeTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SynonymTypeTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(SynonymTypeTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SynonymTypeTheAbstractIterator theSynonymType = (SynonymTypeTheAbstractIterator)findAncestorWithClass(this, SynonymTypeTheAbstractIterator.class);
			pageContext.getOut().print(theSynonymType.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing SynonymType for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing SynonymType for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

