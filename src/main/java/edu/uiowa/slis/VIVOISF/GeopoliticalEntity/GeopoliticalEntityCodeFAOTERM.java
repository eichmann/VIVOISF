package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityCodeFAOTERMIterator theGeopoliticalEntity = (GeopoliticalEntityCodeFAOTERMIterator)findAncestorWithClass(this, GeopoliticalEntityCodeFAOTERMIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

