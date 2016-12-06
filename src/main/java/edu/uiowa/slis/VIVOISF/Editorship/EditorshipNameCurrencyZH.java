package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipNameCurrencyZHIterator theEditorship = (EditorshipNameCurrencyZHIterator)findAncestorWithClass(this, EditorshipNameCurrencyZHIterator.class);
			pageContext.getOut().print(theEditorship.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

