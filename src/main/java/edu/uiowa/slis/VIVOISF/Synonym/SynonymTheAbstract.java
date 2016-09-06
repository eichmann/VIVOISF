package edu.uiowa.slis.VIVOISF.Synonym;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SynonymTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SynonymTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(SynonymTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SynonymTheAbstractIterator theSynonym = (SynonymTheAbstractIterator)findAncestorWithClass(this, SynonymTheAbstractIterator.class);
			pageContext.getOut().print(theSynonym.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Synonym for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Synonym for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

