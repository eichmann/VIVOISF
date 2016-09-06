package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationTranslatorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationTranslatorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationTranslatorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AssociationTranslatorOfIterator theAssociationTranslatorOfIterator = (AssociationTranslatorOfIterator)findAncestorWithClass(this, AssociationTranslatorOfIterator.class);
			pageContext.getOut().print(theAssociationTranslatorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Association for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

