package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipNameCurrencyARIterator theEditorship = (EditorshipNameCurrencyARIterator)findAncestorWithClass(this, EditorshipNameCurrencyARIterator.class);
			pageContext.getOut().print(theEditorship.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

