package edu.uiowa.slis.VIVOISF.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectionCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionCodeFAOTERMIterator theCollection = (CollectionCodeFAOTERMIterator)findAncestorWithClass(this, CollectionCodeFAOTERMIterator.class);
			pageContext.getOut().print(theCollection.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

