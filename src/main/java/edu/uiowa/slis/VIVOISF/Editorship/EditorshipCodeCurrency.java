package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipCodeCurrencyIterator theEditorship = (EditorshipCodeCurrencyIterator)findAncestorWithClass(this, EditorshipCodeCurrencyIterator.class);
			pageContext.getOut().print(theEditorship.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

